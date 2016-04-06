var express = require('express')
    , app = express()
    , server = require('http').createServer(app);

app.set('port', process.env.PORT || 9000);

// angular启动页
app.get('/', function (req, res) {
    res.sendfile('app/index.html');
});

server.listen(app.get('port'), function () {
    console.log('Express server listening on port ' + app.get('port'));
});

module.exports = app;

