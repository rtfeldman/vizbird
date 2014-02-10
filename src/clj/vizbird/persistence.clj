(ns vizbird.persistence)

; Handles persisting vizbird data.
; Uses a file-backed H2 database to store
; things like queries.

(def demo-settings
   {
    :classname   "org.h2.Driver"
    :subprotocol "h2:file"
    :subname     (str (System/getProperty "user.dir") "/" "vizbird.h2.data")
    :user        "sa"
    :password    ""
   }
)

(with-connection demo-settings 
    (create-table :DEMO_TABLE
           [:M_LABEL "varchar(120)"]
           [:M_DATE "varchar(120)"]
           [:M_COMMENT "varchar(32)"]))
