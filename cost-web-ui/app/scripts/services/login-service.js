'use strict';
costAnalysisApp
    .service('loginService', function ($http, Constants) {
        return {
            login: function (user) {
                return $http({
                    method: 'POST',
                    data: user,
                    url: Constants.SERVICE_URLS.LOGIN_URL
                });
            }
        };
    });
