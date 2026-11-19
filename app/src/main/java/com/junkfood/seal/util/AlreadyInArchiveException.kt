package com.junkfood.seal.util

import com.yausername.youtubedl_android.YoutubeDLException

/** The video is already listed in the download archive, so yt-dlp skipped it. */
class AlreadyInArchiveException(message: String) : YoutubeDLException(message)
