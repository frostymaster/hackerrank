import tensorflow as tf

m = tf.constant(3.0)
b = tf.constant(1.5)
x = tf.placeholder(dtype='float32')

y = m * x + b

sess = tf.Session()

print(y.eval({x: 2}, session=sess))

