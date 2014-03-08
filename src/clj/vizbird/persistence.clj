(ns vizbird.persistence
  (:use clojure.java.jdbc))

; Handles persisting vizbird data.
; Uses a file-backed H2 database to store
; things like queries.

(def persistence-settings
   {
    :classname   "org.h2.Driver"
    :subprotocol "h2:file"
    :subname     (str (System/getProperty "user.dir") "/" "vizbird.h2.data;IFEXISTS=TRUE")
    :user        "sa"
    :password    ""
   }
)

; FIXME get an error when loading this up in a repl
(with-connection persistence-settings 
    (create-table :sessions
                  [:id :identity]
                  [:host "varchar(255)" "NOT NULL"]))
