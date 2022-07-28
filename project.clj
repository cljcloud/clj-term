(defproject cljcloud/clj-term "0.1.0"
  :description "Terminal UI for Clojure"
  :url "http://example.com/FIXME"
  :repositories [["github" {:url      "https://maven.pkg.github.com/cljcloud/clj-term"
                            :username "private-token"
                            :password :env/GITHUB_TOKEN}]]
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot      :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"
                                  "-Dclojure.compiler.elide-meta=[:doc :file :line :added]"]}})
