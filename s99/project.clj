(defproject s99 "0.1.0-SNAPSHOT"
  :description "Solutions to the S-99 problems: http://aperiodic.net/phil/scala/s-99/"
  :url "https://github.com/raymonxo/clojure/s99"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot s99.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
