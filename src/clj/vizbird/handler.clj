(ns vizbird.handler
  (:use compojure.core)
  (:use [ring.middleware.params :only [wrap-params]])
  (:require [ring.util.response :as resp])
  (:require [compojure.route    :as route])
  (:require [vizbird.pages      :as pages]))

(defroutes app-routes
  (GET "/query" [] (pages/index))
  (GET "/" [] (resp/resource-response "index.html" {:root "public"}))
  (POST "/connection" [host username password]
        ; TODO if it's a new hostname, generate a random hash to use as the session id, then create a record
        ( 
         str "username: " username " pw: " password " host: " host))
  (route/resources "/")
  (route/not-found "<h1>Page not found</h1>"))

(def app (wrap-params app-routes))
