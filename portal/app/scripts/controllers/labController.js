'use strict';

/**
 * @ngdoc function
 * @name portalApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the portalApp
 */
angular.module('portalApp')
    .controller('LabCtrl', function ($scope, messageCN) {
    })
    .controller('CloudWatchCtrl', function ($scope, $http, CommonService) {
        const CLOUD_WATCH_REST_URL = "cloud/cloudwatch/";
        $scope.alarms = [
            {}
        ];

        CommonService.get(GLOBAL_ENV.urlPrefix + CLOUD_WATCH_REST_URL + "alarms")
            .then(function (content) {
                console.log(content);
                if (!content && !content.length) {
                    $scope.alarms = content;
                }
            });
    });
