'use strict';

angular.module('costAnalysisApp')
  .controller('registerCtrl', ['$scope', '$location', 'registerDirective', function ($scope, $location, registerDirective) {
    $scope.labels = [];
    $scope.data = [];
    $scope.user = {
      username: '',
      password: ''
    };
    $scope.register = registerDirective.register;
  }]);
