"use restrict";
var request = require('supertest');
var chai = require('chai');
var expect = require('chai').expect;
var baseUrl = 'http://localhost:9001/cost';

describe('Integration test start', function () {
    this.timeout(20000);
    it('register api', function (done) {
        var requestBody = {"username": "yan", "password": "password", "email": "syyan@thoughtworks.com"};
        request(baseUrl)
            .post('/rest/auth/register')
            .send(requestBody)
            .expect(200)
            .end(function (err, res) {
                done(err)
            })
    });

    it('login api', function (done) {
        var requestBody = {"username": "yan", "password": "password", "isRemember": true};
        request(baseUrl)
            .post('/rest/auth/login')
            .send(requestBody)
            .expect(200)
            .expect(function (res) {
                expect(res.body).to.equal(true);
            })
            .end(function (err, res) {
                done(err)
            })
    });

    it('cost analysis api', function (done) {
        request(baseUrl)
            .get('/rest/analysis/services/statistic')
            .expect(200)
            .end(function (err, res) {
                done(err)
            })
    })
});
