(defproject vizbird "0.1.0-SNAPSHOT"
  :description "A simple application for visualizing the results of database queries. "
  :url "https://github.com/rtfeldman/vizbird"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [compojure "1.1.5"]
                 [hiccup "0.0.4"]
                 [http-kit "2.1.12"]
                 [hiccup "1.0.4"]]
  :min-lein-version "2.0.0"
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler vizbird.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}})
