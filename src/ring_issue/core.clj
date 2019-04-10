(ns ring-issue.core
  (:gen-class)
  (:require [ring.adapter.jetty :as jetty]))

(defn handler [request]
  (println "*** IN HANDLER")
  (throw (ex-info "random exception" {})))

(defn -main
  []
  (jetty/run-jetty handler {:port 1111}))
