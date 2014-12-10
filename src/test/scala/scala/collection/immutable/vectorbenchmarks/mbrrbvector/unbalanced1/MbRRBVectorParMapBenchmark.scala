package scala.collection.immutable.vectorbenchmarks.mbrrbvector.unbalanced1

import scala.collection.immutable.vectorbenchmarks.genericbenchmarks.ParMapBenchmarks
import scala.collection.immutable.vectorutils.VectorGeneratorType


abstract class MbRRBVectorAbstractParMapBenchmark[@miniboxed A] extends ParMapBenchmarks[A] with MbRRBVectorAbstractBenchmark[A]

class MbRRBVectorParMapIntBenchmark extends MbRRBVectorAbstractParMapBenchmark[Int] with VectorGeneratorType.IntGenerator

class MbRRBVectorParMapStringBenchmark extends MbRRBVectorAbstractParMapBenchmark[String] with VectorGeneratorType.StringGenerator
