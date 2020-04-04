var express = require('express'),http=require('http');
var app=express();
require('ejs');
app.set('view engine','ejs');
let cookie = require('cookie-parser');
app.use(cookie());

http.createServer(app).listen(3000,function(){
    console.log('express 서버가 3000번 포트에서 시작됨.');
});

app.get('/main',function(request,response){
    const hint = 'CrossSiteScript';
    response.cookie("Key is this",hint);
    response.render('post.ejs');
})
app.get('/check',function(request,response){
    if(request.query.subject){
        if(request.query.subject.indexOf('<script>')!==-1&&request.query.subject.indexOf('document.cookie')!==-1){
            response.send('<script type="text/javascript">alert("iKeeper{this_is_XSS_Cooki3333!!}");</script>')
        }else{
            response.send('<script type="text/javascript">alert("권한이 없습니다.");</script>');
        }
    }
})