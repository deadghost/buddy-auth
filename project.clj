(defproject buddy/buddy-auth "0.4.1"
  :description "Authentication and Authorization facilities for ring based web applications."
  :url "https://github.com/funcool/buddy-auth"
  :license {:name "BSD (2-Clause)"
            :url "http://opensource.org/licenses/BSD-2-Clause"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [buddy/buddy-core "0.4.2"]
                 [buddy/buddy-sign "0.4.1"]
                 [cuerdas "0.3.1"]
                 [slingshot "0.12.2"]
                 [ring/ring-core "1.3.2" :exclusions [org.clojure/tools.reader]]
                 [clout "2.1.0"]]
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options"]
  :test-paths ["test"]
  :profiles {:example {:dependencies [[compojure "1.3.2"]
                                      [ring "1.3.2"]]}
             :httpbasic-example
             [:example {:source-paths ["examples/httpbasic/src"]
                        :resource-paths ["examples/httpbasic/resources"]
                        :main ^:skip-aot httpbasic.core}]

             :session-example
             [:example {:source-paths ["examples/session/src"]
                        :resource-paths ["examples/session/resources"]
                        :main ^:skip-aot session.core}]})
