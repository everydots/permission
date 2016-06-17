'use strict';

/**
 * @ngdoc overview
 * @name stockWebUiApp
 * @description
 * # stockWebUiApp
 *
 * Main module of the application.
 */
angular
  .module('costAnalysisApp', [
    'ngAnimate',
    'ngCookies',
    'ngMessages',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'chart.js'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/cost', {
        templateUrl: 'views/cost-analysis.html',
        controller: 'CostAnalysisCtrl',
        controllerAs: 'costAnalysis'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
