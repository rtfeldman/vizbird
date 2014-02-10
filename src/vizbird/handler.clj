(ns vizbird.handler
  (:use compojure.core)
  (:require [ring.util.response :as resp])
  (:require [compojure.route :as route])
  (:require [vizbird.pages :as pages]))

(defroutes app
  (GET "/query" [] (pages/index))
  (GET "/" [] (resp/resource-response "index.html" {:root "public"}))
  (route/resources "/")
  (route/not-found "<h1>Page not found</h1>"))
