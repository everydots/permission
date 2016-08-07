'use strict';

angular.module('costAnalysisApp')
  .controller('registerCtrl', ['$scope', '$location', 'registerService', function ($scope, $location, registerService) {
    $scope.labels = [];
    $scope.data = [];
    $scope.user = {
      username: '',
      password: ''
    };
    $scope.register = function (user) {
      registerService
        .register(user)
        .then(function (result) {
          if (result) {
            $location.path("login");
          }
        });
    }
  }]);
