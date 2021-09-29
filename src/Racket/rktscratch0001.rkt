#lang racket

(define sample (list 10 21 32 43 54 65))

(define (square x) (* x x))

(define (addSquareDigits x)
	(if (> x 0)
		(+ (square (remainder x 10)) (addSquareDigits (floor (/ x 10))))
		0
	)
)

(map addSquareDigits sample)