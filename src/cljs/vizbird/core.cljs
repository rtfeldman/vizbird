(ns vizbird.core
  (:require [goog.dom :as dom]
            [goog.events :as events]
            [cljs.core.async :refer [put! <! chan]]
            [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)
(.log js/console "connection:" (dom/getElement "db-connection"))

(def app-state (atom {:connection nil :rows nil}))

(om/root app-state todo-app (.getElementById js/document "content"))
