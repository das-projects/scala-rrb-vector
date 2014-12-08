package scala.collection.immutable.vectorbenchmarks.rrbvector.xunbalanced

import scala.collection.immutable.vectorbenchmarks.genericbenchmarks.ConcatenationBenchmarks
import scala.collection.immutable.vectorutils.VectorGeneratorType

abstract class RRBVectorAbstractConcatenationBenchmark[@miniboxed A] extends ConcatenationBenchmarks[A] with RRBVectorAbstractBenchmark[A]

class RRBVectorConcatenationIntBenchmark extends RRBVectorAbstractConcatenationBenchmark[Int] with VectorGeneratorType.IntGenerator

class RRBVectorConcatenationStringBenchmark extends RRBVectorAbstractConcatenationBenchmark[String] with VectorGeneratorType.StringGenerator