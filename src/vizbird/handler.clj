(ns vizbird.handler
  (:use compojure.core)
  (:require [compojure.route :as route])
  (:require [vizbird.pages :as pages]))

(defroutes app
  (GET "/" [] (pages/index))
  (route/not-found "<h1>Page not found</h1>"))
