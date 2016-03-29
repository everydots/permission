angular.module("portalApp")
    .value("messageCN", {
        nav_items: [
            {text: "Home", state: "home"},
            {text: "Products", state: "products"},
            {text: "Lab", state: "lab"},
            {text: "Articles", state: "articles"},
            {text: "About me", state: "about"}
        ],
        nav_icons: [
            {name: "QQ", title: "qq", src: "../images/qq.png"},
            {name: "WeChat", title: "wechat", src: "../images/wechat.png"}
        ]
    });