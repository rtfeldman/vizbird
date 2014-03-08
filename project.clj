(defproject vizbird "0.1.0-SNAPSHOT"
  :description "A simple application for visualizing the results of database queries. "
  :url "https://github.com/rtfeldman/vizbird"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [hsqldb/hsqldb "1.8.0.10"]
                 [org.clojure/clojurescript "0.0-2030"]
                 [org.clojure/core.async "0.1.256.0-1bf8cf-alpha"]
                 [compojure "1.1.5"]
                 [hiccup "0.0.4"]
                 [http-kit "2.1.12"]
                 [hiccup "1.0.4"]]
  :min-lein-version "2.0.0"
  :plugins [[lein-ring "0.8.5"]
            [lein-cljsbuild "1.0.2"]]
  :ring {:handler vizbird.handler/app}
  :source-paths ["src/clj"]
  :profiles
    {:dev {:dependencies [[ring-mock "0.1.5"]]}}

  :cljsbuild {
    :builds [{:id "vizbird"
              :source-paths ["src/cljs"]
              :compiler {
                :output-to "resources/public/javascripts/app.js" ; does nothing?
                :output-dir "resources/public/javascripts"
                :optimizations :none
                :source-map true}}]})
