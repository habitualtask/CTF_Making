var express = require('express'),http=require('http');
var app=express();
require('ejs');
app.set('view engine','ejs');

http.createServer(app).listen(3000,function(){
    console.log('express 서버가 3000번 포트에서 시작됨.');
});
app.get('/main',function(request,response){
    response.render('index.ejs',{id:"user1",pw:"test"});
})

app.get('/Key',function(request,response){
    if(request.query.id==="admin"&&request.query.pw==="1234"){
        response.render('Key.ejs')
    }else{
        response.send('<script type="text/javascript">alert("권한이 없습니다.");</script>');
    }
})
app.get('/notice',function(request,response){
    response.render('notice.ejs')
})

