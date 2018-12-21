/*
 * Copyright 2012-2018 Tobi29
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("NOTHING_TO_INLINE")

package net.gitout.ktbindings.gl

import org.lwjgl.opengl.GL41C as JGL41C

actual inline val GL_MAX_VERTEX_UNIFORM_VECTORS: GLenum
    get() = JGL41C.GL_MAX_VERTEX_UNIFORM_VECTORS
actual inline val GL_MAX_VARYING_VECTORS: GLenum
    get() = JGL41C.GL_MAX_VARYING_VECTORS
actual inline val GL_MAX_FRAGMENT_UNIFORM_VECTORS: GLenum
    get() = JGL41C.GL_MAX_FRAGMENT_UNIFORM_VECTORS
actual inline val GL_IMPLEMENTATION_COLOR_READ_TYPE: GLenum
    get() = JGL41C.GL_IMPLEMENTATION_COLOR_READ_TYPE
actual inline val GL_IMPLEMENTATION_COLOR_READ_FORMAT: GLenum
    get() = JGL41C.GL_IMPLEMENTATION_COLOR_READ_FORMAT
actual inline val GL_LOW_FLOAT: GLenum
    get() = JGL41C.GL_LOW_FLOAT
actual inline val GL_MEDIUM_FLOAT: GLenum
    get() = JGL41C.GL_MEDIUM_FLOAT
actual inline val GL_HIGH_FLOAT: GLenum
    get() = JGL41C.GL_HIGH_FLOAT
actual inline val GL_LOW_INT: GLenum
    get() = JGL41C.GL_LOW_INT
actual inline val GL_MEDIUM_INT: GLenum
    get() = JGL41C.GL_MEDIUM_INT
actual inline val GL_HIGH_INT: GLenum
    get() = JGL41C.GL_HIGH_INT
actual inline val GL_RGB565: GLenum
    get() = JGL41C.GL_RGB565

actual inline fun GL41.glClearDepth(
    depth: GLclampf
) = JGL41C.glClearDepthf(
    depth
)

actual inline fun GL41.glDepthRange(
    zNear: GLclampf, zFar: GLclampf
) = JGL41C.glDepthRangef(
    zNear, zFar
)
