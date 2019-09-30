package controller;

import http.request.HttpRequest;
import http.response.HttpResponse;
import view.ModelAndView;

public abstract class AbstractController {
    protected ModelAndView doGet(HttpRequest request, HttpResponse response) {
        throw new NotSupportedHttpMethodException(request.getMethod());
    }

    protected ModelAndView doPost(HttpRequest request, HttpResponse response) {
        throw new NotSupportedHttpMethodException(request.getMethod());
    }
}
