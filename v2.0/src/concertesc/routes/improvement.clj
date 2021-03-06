(ns concertesc.routes.improvement
  (:require [criterium.core :as criterium]
            [concertesc.utils :as util]
            [concertesc.routes.flight :as flight]
            [concertesc.routes.event :as ev]
            [concertesc.routes.distance :as dist]))

;utils

;(def param (util/string->date "yyyy-MM-dd" "2015-05-21"))

;(criterium/with-progress-reporting (criterium/bench (util/get-date-formatter "yyyy-MM-dd") :verbose))

;(criterium/with-progress-reporting (criterium/bench (util/string->date "yyyy-MM-dd" "2015-05-21") :verbose))

;(criterium/with-progress-reporting (criterium/bench (util/date->string "yyyy-MM-dd" param) :verbose))

;(criterium/with-progress-reporting (criterium/bench (util/replace-space "tove lo") :verbose))

;(criterium/with-progress-reporting (criterium/bench (util/get-following-or-preceding-date :plus param) :verbose))

;(criterium/with-progress-reporting (criterium/bench (util/degrees->radians 60) :verbose))

;(criterium/with-progress-reporting (criterium/bench (util/process-d 3.14) :verbose))

;(criterium/with-progress-reporting (criterium/bench (util/calculate-distance [3.14 2.15] [30.15 8.11]) :verbose))

;(criterium/with-progress-reporting (criterium/bench util/now :verbose))

;flight

;(def param1 (-> "tove-lo" ev/request-events first))

;(criterium/with-progress-reporting (criterium/bench (flight/get-flight-parameters param1 "BCN") :verbose))

;(criterium/with-progress-reporting (criterium/bench (flight/create-request-body "BCN" "MUC" "2015-10-05" "2015-10-07") :verbose))

;(def param2 (flight/create-request-body "BCN" "MUC" "2015-10-05" "2015-10-07"))

;(criterium/with-progress-reporting (criterium/bench (flight/send-request param2) :verbose))

;(criterium/with-progress-reporting (criterium/bench (flight/send-flight-request ["BCN" "MUC" "2015-10-05" "2015-10-07"]) :verbose))

;(def body (flight/send-flight-request ["BCN" "MUC" "2015-10-05" "2015-10-07"]))

;(def connection (-> body :trips :tripOption first :slice first :segment))

;(def carriermap (-> body :trips :data :carrier))

;(def param3 (first connection))

;(def param4 (-> param3 :flight :carrier ))

;(criterium/with-progress-reporting (criterium/bench (flight/process-city param3 :origin) :verbose))

;(criterium/with-progress-reporting (criterium/bench (flight/find-carrier param4 carriermap) :verbose))

;(criterium/with-progress-reporting (criterium/bench (flight/process-carrier param3 carriermap) :verbose))

;(criterium/with-progress-reporting (criterium/bench (flight/process-date param3 :departureTime) :verbose))

;(criterium/with-progress-reporting (criterium/bench (flight/process-connection param3 carriermap) :verbose))

;(criterium/with-progress-reporting (criterium/bench (flight/process-flight-connection connection carriermap) :verbose))

;(def param5 (flight/send-flight-request ["BCN" "MUC" "2015-10-05" "2015-10-07"]))

;(criterium/with-progress-reporting (criterium/bench (flight/process-response param5) :verbose))

;(criterium/with-progress-reporting (criterium/bench (flight/get-flights param1 "BCN") :verbose))

;event

;(criterium/with-progress-reporting (criterium/bench (ev/send-request "tove-lo") :verbose))

;(def param1 (ev/send-request "tove-lo"))

;(criterium/with-progress-reporting (criterium/bench (ev/parse-response param1) :verbose))

;(def param2 (-> "tove-lo" ev/send-request ev/parse-response first))

;(criterium/with-progress-reporting (criterium/bench (ev/process-event param2) :verbose))

;(def param3 (-> "tove-lo" ev/send-request ev/parse-response))

;(criterium/with-progress-reporting (criterium/bench (ev/process-response param3) :verbose))

;(criterium/with-progress-reporting (criterium/bench (ev/request-events "tove-lo") :verbose))

;distance

;(criterium/with-progress-reporting (criterium/bench (dist/get-coordinates "BCN") :verbose))

;(criterium/with-progress-reporting (criterium/bench (dist/degrees->radians [60 90]) :verbose))

;(criterium/with-progress-reporting (criterium/bench (dist/calculate-distance "BCN" [90 120]) :verbose))
