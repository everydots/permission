'use strict';

/**
 * @ngdoc function
 * @name stockWebUiApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the stockWebUiApp
 */
angular.module('costAnalysisApp')
  .controller('CostAnalysisCtrl', function ($scope) {
    $scope.labels = ["January", "February", "March", "April", "May", "June", "July"];
    $scope.series = ['Series A', 'Series B'];
    $scope.data = [
      [65, 59, 80, 81, 56, 55, 40],
      [28, 48, 40, 19, 86, 27, 90]
    ];
    $scope.onClick = function (points, evt) {
      console.log(points, evt);
    };

  });
