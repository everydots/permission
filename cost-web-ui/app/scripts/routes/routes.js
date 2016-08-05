'use strict';

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
      .when('/login', {
        templateUrl: '../../views/template/login-page.html',
        controller: 'loginCtrl'
      })
      .when('/register', {
        templateUrl: '../../views/template/register-page.html',
        controller: 'registerCtrl'
      })
      .otherwise({
        redirectTo: '/main'
      });
  });
