portalApp.service('CommonService', function ($http) {
    return {
        get: function (url) {
            return $http({
                method: 'GET',
                url: url
            });
        }
    }
})