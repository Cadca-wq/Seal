package com.junkfood.seal.util

/** The video is already listed in the download archive, so yt-dlp skipped it. */
class AlreadyInArchiveException(message: String) : Exception(message)
