(ns clay-test.core
  (:require [scicloj.clay.v2.api :as clay]))



(comment

  (clay/make! {:source-path         ["notebooks/index.clj"
                                     "components/component3/docs/index.clj"
                                     "components/component1/docs/index.clj"
                                     "components/component2/docs/index.clj"]
               :first-as-index      true
               :browse              false
               :live-reload         true
               :format              [:quarto :html]
               :clean-up-target-dir true
               :book                {:title "Test documentation"}})
  )
