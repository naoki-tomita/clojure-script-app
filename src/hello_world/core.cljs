(ns hello-world.core)
; var count = 0;
; var counter = document.getElementById("counter");
; var countUp = function() {
;   count++;
;   counter.innerHTML = count;
; }
; var onButtonClick = function() {
;   countUp();
; }
; var btn = document.getElementById("btn");
; btn.addEventListener(onButtonClick);

; 変数宣言は、 def を使う
; cljs.coreにcountという変数があるらしく、警告が出るんだけど、しゃーない。
(def count 0)
(def counter (.getElementById js/document "counter"))
; 関数は defn を使う。
; defn <関数名> [<引数リスト スペース区切り>] 以降に処理を書く
(defn countUp []
    (set! count (+ count 1))
    (set! (.-innerHTML counter) count))
; (<関数名>) で引数なしで関数が呼べるっぽい
(defn onButtonClick []
  (countUp))
(.addEventListener (.getElementById js/document "btn") "click" onButtonClick)