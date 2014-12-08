package scala.collection.immutable.vectorbenchmarks.rrbvector.balanced

import scala.collection.immutable.rrbvector.RRBVector
import scala.collection.immutable.vectorbenchmarks.genericbenchmarks.BuilderBenchmarks
import scala.collection.immutable.vectorutils.VectorGeneratorType

abstract class RRBVectorAbstractBuilderBenchmark[@miniboxed A] extends BuilderBenchmarks[A] with RRBVectorAbstractBenchmark[A] {
    def buildVector(n: Int): Int = {
        var i = 0
        var b = RRBVector.newBuilder[A]
        val e = element(0)
        while (i < n) {
            b += e
            i += 1
        }
        b.result().length
    }
}

class RRBVectorBuilderIntBenchmark extends RRBVectorAbstractBuilderBenchmark[Int] with VectorGeneratorType.IntGenerator

class RRBVectorBuilderStringBenchmark extends RRBVectorAbstractBuilderBenchmark[String] with VectorGeneratorType.StringGenerator