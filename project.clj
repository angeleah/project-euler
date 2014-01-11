(defproject project_euler "1.0.0-SNAPSHOT"
  :description "Problems 1-4 from project euler solved with Clojure."
  :dependencies [[org.clojure/clojure "1.5.1"]
                [org.clojure/math.numeric-tower "0.0.1"]]
  :profiles {:dev {:dependencies [[speclj "2.9.1"]]}}
  :plugins [[speclj "2.9.1"]]
  :test-paths ["spec"]
  :main project_euler.core
)
