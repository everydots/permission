var ENV = "http://localhost:9001/cost/";
angular.module('costAnalysisApp')
  .constant('Constants', {
    service_urls: {
      service_cost: ENV + "rest/analysis/services"
    }
  });
