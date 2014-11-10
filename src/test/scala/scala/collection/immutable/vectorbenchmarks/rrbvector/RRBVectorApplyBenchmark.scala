package scala.collection.immutable.vectorbenchmarks.rrbvector


import scala.collection.immutable.vectorbenchmarks.RRBVectorBenchmark
import scala.collection.immutable.vectorbenchmarks.genericbenchmarks.ApplyBenchmarks
import scala.collection.immutable.vectorutils.VectorGeneratorType


abstract class RRBVectorAbstractApplyBenchmark[A] extends ApplyBenchmarks[A] with RRBVectorBenchmark[A]

class RRBVectorApplyIntBenchmark extends RRBVectorAbstractApplyBenchmark[Int] with VectorGeneratorType.IntGenerator

class RRBVectorApplyStringBenchmark extends RRBVectorAbstractApplyBenchmark[String] with VectorGeneratorType.StringGenerator