module.exports = {
  publicPath: './',
  outputDir: 'dist',
  pages: {
    index: {
      // entry for the page
      entry: 'src/main.ts'
    }
  },
  devServer: {
    port: 3000,
    proxy: {
      '.*/api': {
        target: 'http://localhost:8080/',
        ws: false,
        changeOrigin: true
      },
    }
  }
}
