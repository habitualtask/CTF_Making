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
    const hint = "song's_Cookieee";
    response.cookie("keeper_cookie",hint);
    response.render('changecookie.ejs');
})
app.get('/checkCookie',function(request,response){
    var keeper_Cookie = request.cookies.keeper_cookie;

    if(keeper_Cookie==='6'){
       response.send('<script type="text/javascript">alert("iKeeper{Songs_CookieWorld_hahah}");</script>') 
    }
    else{
        response.send('<script type="text/javascript">alert("'+keeper_Cookie+'");</script>');
    }
})