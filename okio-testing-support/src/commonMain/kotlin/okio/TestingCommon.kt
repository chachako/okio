/*
 * Copyright (C) 2019 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package okio

import kotlin.random.Random
import kotlin.test.assertEquals
import okio.ByteString.Companion.toByteString

fun Char.repeat(count: Int): String {
  return toString().repeat(count)
}

fun assertArrayEquals(a: ByteArray, b: ByteArray) {
  assertEquals(a.contentToString(), b.contentToString())
}

fun randomBytes(length: Int): ByteString {
  val random = Random(0)
  val randomBytes = ByteArray(length)
  random.nextBytes(randomBytes)
  return ByteString.of(*randomBytes)
}

fun randomToken(length: Int) = Random.nextBytes(length).toByteString(0, length).hex()

expect fun isBrowser(): Boolean

expect fun isWasm(): Boolean
