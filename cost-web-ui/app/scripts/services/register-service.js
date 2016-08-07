'use strict';
angular.module('costAnalysisApp')
  .service('registerService', function ($http, Constants) {
    return {
      register: function (user) {
        return $http({
          method: 'POST',
          data: user,
          url: Constants.SERVICE_URLS.REGISTER_URL
        });
      }
    };
  });
