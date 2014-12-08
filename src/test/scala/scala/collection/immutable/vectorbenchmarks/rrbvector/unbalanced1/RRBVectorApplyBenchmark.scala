package scala.collection.immutable.vectorbenchmarks.rrbvector.unbalanced1

import scala.collection.immutable.vectorbenchmarks.genericbenchmarks.ApplyBenchmarks
import scala.collection.immutable.vectorutils.VectorGeneratorType


abstract class RRBVectorAbstractApplyBenchmark[@miniboxed A] extends ApplyBenchmarks[A] with RRBVectorAbstractBenchmark[A]

class RRBVectorApplyIntBenchmark extends RRBVectorAbstractApplyBenchmark[Int] with VectorGeneratorType.IntGenerator

class RRBVectorApplyStringBenchmark extends RRBVectorAbstractApplyBenchmark[String] with VectorGeneratorType.StringGenerator