(defproject storm/storm-kestrel "0.7.0-mx-1-SNAPSHOT"
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :javac-options {:debug "true"}
  :dependencies [[kestrel-thrift-java-bindings "2.2.0"]]
  :profiles {:dev
              {:dependencies [[storm "0.8.0"]],
               :jvm-opts ["-Djava.library.path=/usr/local/lib:/opt/local/lib:/usr/lib"]}}
  :min-lein-version "2.0.0")
