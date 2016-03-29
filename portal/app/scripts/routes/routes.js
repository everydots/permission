portalApp.config(function ($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('home', {
        templateUrl: 'views/home.html',
        controller: 'HomeCtrl',
        controllerAs: 'home',
        url: "/home"
    });

    $stateProvider
        .state('home', {
            url: "/home",
            templateUrl: 'views/home.html',
            controller: 'HomeCtrl',
            controllerAs: 'home'
        })
        .state('products', {
            url: "/products",
            templateUrl: 'views/products/products.html',
            controller: 'ProductsCtrl',
            controllerAs: 'products'
        })

        .state('lab', {
            url: "/lab",
            templateUrl: 'views/lab/lab.html',
            controller: 'LabCtrl',
            controllerAs: 'lab'
        }).state('lab.all', {
            url: "/all",
            templateUrl: 'views/lab/all.html'
        }).state('lab.ec2', {
            url: "/ec2",
            templateUrl: 'views/lab/ec2.html'
        }).state('lab.cloudwatch', {
            url: "/cloudwatch",
            templateUrl: 'views/lab/cloudwatch.html',
            controller: 'CloudWatchCtrl',
            controllerAs: 'cloudwatch'
        })

        .state('articles', {
            url: "/articles",
            templateUrl: 'views/articles/articles.html',
            controller: 'ArticlesCtrl',
            controllerAs: 'articles'
        })
        .state('about', {
            url: "/about",
            templateUrl: 'views/about/about.html',
            controller: 'AboutCtrl',
            controllerAs: 'about'
        })
});