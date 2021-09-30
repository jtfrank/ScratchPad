#lang racket

(define (square x) (* x x))

(define (addSquareDigits x)
	(if (> x 0)
		(+ (square (remainder x 10)) (addSquareDigits (floor (/ x 10))))
		0
	)
)

(define (ishappy? x hist)
	(cond
		[(= x 1) #t]
		[(member x hist) #f]
		[else (ishappy? (addSquareDigits x) (cons x hist))]
	)
)

(define (findHappyNumbers n s result)
	(cond
		[(< n 1) (sort result <)]
		[(ishappy? s empty)
			(findHappyNumbers (- n 1) (+ s 1) (cons s result))
		]
		[else
			(findHappyNumbers n (+ s 1) result)
		]
	)
)

(findHappyNumbers 10 1 empty)