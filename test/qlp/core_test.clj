(ns qlp.core-test
  (:require [clojure.test :refer :all]
            [qlp.core :refer :all]))

(deftest a-test
  (testing "When we talk without context... it might not be important."
    (is 
      (= (what (_if (plq (_is (better (_then (qlp (_? nil))))))))) 
      (i (dont (know nil))) 
    )
  )
)
