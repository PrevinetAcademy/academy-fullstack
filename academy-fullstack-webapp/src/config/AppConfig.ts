const HOST = window.location.hostname;
const PORT = window.location.port;
const PROTOCOL = window.location.protocol;

const BASE_URL = `${PROTOCOL}//${HOST}:${PORT}/academy-fullstack`;

const SERVICE_BASE_URL = `${BASE_URL}/api`; 

export {BASE_URL, SERVICE_BASE_URL}