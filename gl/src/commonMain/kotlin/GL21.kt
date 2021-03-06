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

package net.gitout.ktbindings.gl

expect val GL_PIXEL_PACK_BUFFER: GLenum
expect val GL_PIXEL_UNPACK_BUFFER: GLenum
expect val GL_PIXEL_PACK_BUFFER_BINDING: GLenum
expect val GL_PIXEL_UNPACK_BUFFER_BINDING: GLenum
expect val GL_FLOAT_MAT2x3: GLenum
expect val GL_FLOAT_MAT2x4: GLenum
expect val GL_FLOAT_MAT3x2: GLenum
expect val GL_FLOAT_MAT3x4: GLenum
expect val GL_FLOAT_MAT4x2: GLenum
expect val GL_FLOAT_MAT4x3: GLenum
expect val GL_SRGB: GLenum
expect val GL_SRGB8: GLenum
expect val GL_SRGB8_ALPHA8: GLenum

expect fun GL21.glUniformMatrix3x2fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
)

expect fun GL21.glUniformMatrix4x2fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
)

expect fun GL21.glUniformMatrix2x3fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
)

expect fun GL21.glUniformMatrix4x3fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
)

expect fun GL21.glUniformMatrix2x4fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
)

expect fun GL21.glUniformMatrix3x4fv(
    location: GLUniformLocation, transpose: GLboolean, data: Float32List
)
