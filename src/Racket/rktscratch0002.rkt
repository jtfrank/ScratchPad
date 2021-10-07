#lang racket

(define (fib x)
	(define (fibit x y z)
		(cond [(> x 0) (fibit (- x 1) z (+ y z))]
			[else y]
		)
	)
	
	(fibit x 0 1)
)

(fib 0)
(fib 1)
(fib 2)
(fib 3)
(fib 4)
(fib 5)
(fib 43)