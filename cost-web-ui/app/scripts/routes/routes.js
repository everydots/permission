costAnalysisApp
    .config(function ($routeProvider) {
        $routeProvider
            .when('/main', {
                templateUrl: '../../views/main.html',
                controller: 'MainCtrl',
                controllerAs: 'main'
            })
            .when('/cost', {
                templateUrl: '../../views/cost-analysis.html',
                controller: 'CostAnalysisCtrl',
                controllerAs: 'costAnalysis'
            })
            .otherwise({
                redirectTo: '/main'
            });
    });
