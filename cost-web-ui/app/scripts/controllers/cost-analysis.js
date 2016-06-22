'use strict';

/**
 * @ngdoc function
 * @name stockWebUiApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the stockWebUiApp
 */
angular.module('costAnalysisApp')
    .controller('CostAnalysisCtrl', function ($scope, $http, Constants) {
        $scope.labels = [];
        $scope.data = [];
        $scope.series = ["Service Cost"];

        $http
            .get(Constants.service_urls.service_cost_statistic)
            .then(function (content) {
                if (content.status == 200 && angular.isArray(content.data)) {
                    content.data.forEach(function (item) {
                        $scope.labels.push(item.service_name);
                        $scope.data.push(item.cost);
                    });
                }
            });


    });
