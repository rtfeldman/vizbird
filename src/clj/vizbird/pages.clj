(ns vizbird.pages
  (:require [hiccup.page :as page]))

(defn index []
  (page/html5
    [:head
      [:title "Hello World"]]
    [:body
      [:div {:id "content"} "Hello World"]]))

