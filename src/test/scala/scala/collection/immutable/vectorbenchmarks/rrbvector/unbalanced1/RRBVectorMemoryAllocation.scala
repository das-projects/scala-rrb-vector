package scala.collection.immutable.vectorbenchmarks.rrbvector.unbalanced1

import scala.collection.immutable.vectorbenchmarks.genericbenchmarks.MemoryAllocation
import scala.collection.immutable.vectorutils.VectorGeneratorType


abstract class RRBVectorAbstractMemoryAllocation[@miniboxed A] extends MemoryAllocation[A] with RRBVectorAbstractBenchmark[A]

class RRBVectorIntMemoryAllocation extends RRBVectorAbstractMemoryAllocation[Int] with VectorGeneratorType.IntGenerator

class RRBVectorStringMemoryAllocation extends RRBVectorAbstractMemoryAllocation[String] with VectorGeneratorType.StringGenerator